package concursantes;

@SuppressWarnings("serial")
class EjecucionException extends RuntimeException {
	public EjecucionException() {
	}

	public EjecucionException(String msg) {
		super(msg);
	}
}
