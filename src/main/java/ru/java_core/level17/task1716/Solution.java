package ru.java_core.level17.task1716;

/*
Синхронизированные методы
Вообще, по Эккелю - нужно следовать правилу Брайана:
"Если вы записываете данные в переменную, которая может быть затем прочитана другим потоком,
или читаете данные из переменной, которая могла быть записана другим потоком,
вы должны использовать синхронизацию..." В условии задачи сказано, что объект класса Solution
будет использоваться нитями. Solution, между тем, имеет всего 2 переменные класса (которые,
потенциально, могут быть общими для разных нитей). Отсюда - все просто - те методы,
которые модифицируют или читают эти 2 переменные делаем synchronized согласно правилу Брайана.
*/
public class Solution {
    private double param = Math.random();
    private StringBuilder sb = new StringBuilder();

    private void method0() {
        Double d = method3();
    }

    protected void method1(String param1) {
        Solution solution = new Solution();
        solution.method0();
    }

    public void method2(int param1) {
        param1++;
    }

    synchronized double method3() {
        double random = Math.random();
        param += 40.7;
        return random + param;
    }

    private synchronized void method4() {
        sb.append(1).append(1).append(1).append(1);
    }

    protected void method5(String param2) {
        new StringBuffer().append(param2).append(param2).append(param2);
    }

    public synchronized String method6(int param2) {
        System.out.println("Thinking....");
        method7(5e-2);
        sb = new StringBuilder("Got it!.");
        return sb.toString();
    }

    String method7(double param2) {
        return "" + param2;
    }

    public static void main(String[] args) {

    }

}
