package doroddong.spring_boot;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(value={"doroddong.spring_boot.board.mapper"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    //SQL Session Factory 설정

    @Bean //필요한 객체 생성
    public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

        sessionFactory.setDataSource(dataSource);
        return sessionFactory.getObject();
    }
	/*sqlSessionFactory() : MyBatis의 SQLSessionFactory를 반환,
	스프링부트가 실행할 떄 DataSource객체를 이 메서드 실행 시 주입해서 결과를 만들고,
	그 결과를 스프링내 빈으로 사용
	*/
}
