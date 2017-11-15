package hello.helloContorller;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/compute")
public class RestApiController {
    @GetMapping("/add")
    public int add(@RequestParam int a,  @RequestParam int b) {
        return a + b;
    }

    @PostMapping("/sub")
    public Double sub(@RequestParam Double a,  @RequestParam Double b) {
        return a - b;
    }

    @PostMapping("/mul")
    public Double mul(@RequestParam Double a,  @RequestParam Double b) {
        return a * b;
    }
}

