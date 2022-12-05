public interface HomeWorkInterface {

//    В текушем проекте начисления ЗП создать интерфейс со следующими полями
//    String name;  //Имя сотрудника
//    int beforeTax; //  ЗП до вычитания налогов
//    int salary;   //  Зарплата после вычетов
//    int taxPercent;// Налог в %
//    int taxRub;  // Налог в рублях
//    boolean offshore; // Офшор
//    int sizeBonus;  //Если более 200 часов - премия
//    boolean children; //Наличие детей
//    String typeSalary;

//    и методами

//	  public void calcSalary();
//    public void calcTax();
//	  public void setData();
    
//    + все геттеры и сеттеры
//
//    Прислать только файл данного интерфейса

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
