package org.example.pojos.vwo.response;

public class LoginResponse {

    private String message;
    private String showCaptcha;
    private String captchaKey;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getShowCaptcha() {
        return showCaptcha;
    }

    public void setShowCaptcha(String showCaptcha) {
        this.showCaptcha = showCaptcha;
    }

    public String getCaptchaKey() {
        return captchaKey;
    }

    public void setCaptchaKey(String captchaKey) {
        this.captchaKey = captchaKey;
    }
}