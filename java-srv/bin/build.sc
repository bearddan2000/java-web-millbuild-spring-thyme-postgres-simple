import mill._, scalalib._

object Spring extends JavaModule {
  def scalaVersion = "2.13.1"

  def ivyDeps = Agg(
ivy"org.springframework.boot:spring-boot-starter-web:2.4.2",
ivy"org.springframework.boot:spring-boot-starter-thymeleaf:2.4.2",
ivy"org.springframework.boot:spring-boot-starter-data-jpa:2.4.2",
ivy"org.projectlombok:lombok:1.18.8",
ivy"org.postgresql:postgresql:42.2.19",
ivy"javax.annotation:javax.annotation-api:1.3.2"
  )
}
