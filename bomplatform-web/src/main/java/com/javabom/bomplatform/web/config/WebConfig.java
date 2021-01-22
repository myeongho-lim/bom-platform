package com.javabom.bomplatform.web.config;

import com.javabom.bomplatform.core.config.QueryDslConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Import 어노테이션으로 다른 모듈의 Configuration 클래스를 가져와서 다른 모듈의 컴포넌트 스캔을 진행한다.
 */
@Configuration
@ComponentScan(basePackages = {"com.javabom.bomplatform.web"})
@Import({QueryDslConfiguration.class})
public class WebConfig {
}
