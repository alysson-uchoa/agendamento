package CashRegister;

public class CashRegister {
    private static int code = 1;
    private double total, pay;
    private int form_of_payment, id;

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public int getForm_of_payment() {
        return form_of_payment;
    }

    public void setForm_of_payment(int form_of_payment) {
        this.form_of_payment = form_of_payment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CashRegister(double total, double pay, int form_of_payment) {
        this.total = total;
        this.pay = pay;
        this.form_of_payment = form_of_payment;
        id = code;
        code++;
    }


}
