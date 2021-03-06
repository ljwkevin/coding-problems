package liugh.test_JavaDesignMode.行为模式.访问者模式.visitor;

/**
 * 定义一个accept操作，它以一个访问者为参数
 * 
 * @author liu yuning
 *
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}

class ConcreteElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
	visitor.visitConcreteElementA(this);
    }

}

class ConcreteElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
	visitor.visitConcreteElementB(this);
    }

}