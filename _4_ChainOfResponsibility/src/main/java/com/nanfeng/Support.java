package com.nanfeng;

public abstract class Support {

    private String name;

    private Support next;

    public Support(String name) {
        this.name = name;
    }

    public Support setNext(Support next) {
        this.next = next;
        return next;
    }

    public final void support(Trouble trouble) {
        if (resolve(trouble)) {
            done(trouble);
        } else if (next != null) {
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }
    public String toString() {
        return "["+name+"]";
    }

    abstract boolean resolve(Trouble trouble);

    void done(Trouble trouble) {
        System.out.println(trouble +" 被" + this +"解决.");
    }

    void fail(Trouble trouble) {
        System.out.println(trouble + "不能被解决");
    }

}
