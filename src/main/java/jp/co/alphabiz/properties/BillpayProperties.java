package jp.co.alphabiz.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * プロパティ処理するUtil
 */
@Component
@PropertySource(value = {"classpath:business.properties"})
@ConfigurationProperties(prefix = "")
@Data
public class BillpayProperties {
	private String restURL;
}
