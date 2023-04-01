package 作业;

//录入
public class Bao {
    private String Company;//快递公司
    private int Danhao;//快递单号
    private String Numbers;//手机号
    private String Code;//取件码

    public Bao(String Company, int Danhao, String numbers, String code) {
        this.Company = Company;
        this.Danhao = Danhao;
        Numbers = numbers;
        Code = code;
    }

    public String getCompany() {
        return Company;
    }
    public int getDanhao() {
        return Danhao;
    }
    public String getNumbers() {
        return Numbers;
    }
    public String getCode() {
        return Code;
    }

    public void setCompany(String company) {
        this.Company = company;
    }
    public void setDanhao(int danhao) {
        this.Danhao = danhao;
    }
    public void setNumbers(String numbers) {
        Numbers = numbers;
    }
    public void setCode(String code) {
        Code = code;
    }
}
