package za.ac.cput.chapter5assignment.prototype;

/**
 * Created by student on 2015/03/12.
 */
public class Account implements CloneObject {
    private int accountNum;

    public Account(int accountNum){
        this.accountNum = accountNum;
    }

    @Override
    public CloneObject makeCopy() {
        return new Account(accountNum);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNum=" + accountNum +
                '}';
    }
}
