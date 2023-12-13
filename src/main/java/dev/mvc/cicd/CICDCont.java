package dev.mvc.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController // Json , Ajax 기반으로 사용하겠다는 소리 
public class CICDCont {
  // http://localhost:9091/cicd?sw=1
  // http://localhost:9091/cicd?sw=-1
  // http://localhost:9091/cicd?sw=0
  @GetMapping("/cicd")
  public String cicd(@RequestParam(defaultValue = "1") Integer sw) {
    String msg = "";
    
    if (sw == 1) {
      msg = "/cicd 호출됨, info 로그";
      log.info(msg);
    } else if (sw == -1) {
      msg = "/cide 호출됨, error 로그";
      log.error(msg);
    } else if (sw == 0) {
      msg = "/cide 호출됨, warn 로그";
      log.warn(msg);
    }
    
    return "<h3>" + msg + "</h3>";
  }
}