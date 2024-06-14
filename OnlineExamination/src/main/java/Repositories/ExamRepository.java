package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import Models.Exam;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Long> {
}
