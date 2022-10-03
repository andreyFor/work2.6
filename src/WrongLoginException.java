class WrongLoginException extends Exception{
    public WrongLoginException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    public WrongLoginException(String message) {
        super(message);
    }

}