package Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vijay.OnlineExamination.ResourceNotFoundException;

import Models.Result;
import Repositories.ResultRepository;

@Service
public class ResultService {

    @Autowired
    private ResultRepository resultRepository;

    public List<Result> getAllResults() {
        return resultRepository.findAll();
    }

    public Result getResultById(Long id) {
        return resultRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Result not found"));
    }

    public Result createResult(Result result) {
        return resultRepository.save(result);
    }

    public Result updateResult(Long id, Result resultDetails) {
        Result result = getResultById(id);
        result.setUserId(resultDetails.getUserId());
        result.setExamId(resultDetails.getExamId());
        result.setScore(resultDetails.getScore());
        return resultRepository.save(result);
    }

    public void deleteResult(Long id) {
        resultRepository.deleteById(id);
    }
}
