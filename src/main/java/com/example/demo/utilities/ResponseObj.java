package com.example.demo.utilities;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ResponseObj {

	private int status_code;
	private String status;
	private String message;
	private Object object;

	public ResponseObj() {

	}

	public ResponseObj(int status_code, String status, String message, Object object) {
		super();
		this.status_code = status_code;
		this.status = status;
		this.message = message;
		this.object = object;
	}

	public int getStatus_code() {
		return status_code;
	}

	public void setStatus_code(int status_code) {
		this.status_code = status_code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "ResponseObj [status_code=" + status_code + ", status=" + status + ", message=" + message + ", object="
				+ object + "]";
	}
}