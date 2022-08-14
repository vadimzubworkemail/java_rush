package ru.java_core.level13.task1328;

public final class BodyPart {
    final static BodyPart LEG = new BodyPart("����");
    final static BodyPart HEAD = new BodyPart("������");
    final static BodyPart ARM = new BodyPart("����");
    final static BodyPart CHEST = new BodyPart("�����");

    private String bodyPart;

    private BodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString() {
        return this.bodyPart;
    }
}
