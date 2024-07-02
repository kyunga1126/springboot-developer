package home.springbootdeveloper.springbootdeveloper.repository;

import home.springbootdeveloper.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
