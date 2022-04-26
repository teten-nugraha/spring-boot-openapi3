package id.ten.springswagger.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")
public class HelloController {

  @GetMapping
  public ResponseEntity<List<String>> hello() {
    List<String> datas = Arrays.asList("Hello Budi", "Hello Jhon", "Hello Tony");
    return new ResponseEntity<>(datas, HttpStatus.OK);
  }

}
