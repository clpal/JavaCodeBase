package designPattern.designsingleton.observerDesignPattern;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
