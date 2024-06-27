package homework;

public abstract class Animal {
  private String arm;
  private String body;
  private String head;
  private String leg;
  private String tail;

  public String getArm() {
    return arm;
  }

  public void setArm(String arm) {
    this.arm = arm;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getHead() {
    return head;
  }

  public void setHead(String head) {
    this.head = head;
  }

  public String getLeg() {
    return leg;
  }

  public void setLeg(String leg) {
    this.leg = leg;
  }

  public String getTail() {
    return tail;
  }

  public void setTail(String tail) {
    this.tail = tail;
  }

  public abstract void eat();

  public void showMe() {
    System.out.println(
        "Animal{"
            + "Arm='"
            + arm
            + '\''
            + ", Body='"
            + body
            + '\''
            + ", Head='"
            + head
            + '\''
            + ", Leg='"
            + leg
            + '\''
            + ", Tail='"
            + tail
            + '\''
            + '}');
    eat();
  }
}
