package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Models.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
