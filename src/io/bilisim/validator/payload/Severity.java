package io.bilisim.validator.payload;

import javax.validation.Payload;

public interface Severity {
	public interface Info extends Payload {
	}
	
	public interface Error extends Payload {
	}
}
