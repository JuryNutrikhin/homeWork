package homeWork;

public interface HomeWorkInterface {

//    � ������� ������� ���������� �� ������� ��������� �� ���������� ������
//    String name;  //��� ����������
//    int beforeTax; //  �� �� ��������� �������
//    int salary;   //  �������� ����� �������
//    int taxPercent;// ����� � %
//    int taxRub;  // ����� � ������
//    boolean offshore; // �����
//    int sizeBonus;  //���� ����� 200 ����� - ������
//    boolean children; //������� �����
//    String typeSalary;

//    � ��������

//	  public void calcSalary();
//    public void calcTax();
//	  public void setData();
    
//    + ��� ������� � �������
//
//    �������� ������ ���� ������� ����������

//...............................................................................
    String name = "";
    int     beforeTax = 0;
    int     salary= 0 ;
    int     taxPercent =0;
    int     taxRub= 0 ;
    boolean offshore = false;
    int     sizeBonus= 0;
    boolean children = false;
    String  typeSalary="";

    void    calcSalary();
    void    calcTax();
    void    setData();

    void    setName();
    void    setBeforeTax();
    void    setSalary();
    void    setTaxPercent();
    void    setTaxRub();
    void    setOffshore();
    void    setSizeBonus();
    void    setChildren();
    void    setTypeSalary();

    String  getName();
    int     getBeforeTax();
    int     getSalary();
    int     getTaxPercent();
    int     getTaxRub();
    boolean getOffshore();
    int     getSizeBonus();
    boolean getChildren();
    String  getTypeSalary();



}
