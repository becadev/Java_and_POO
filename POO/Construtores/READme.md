# Construtores 
- tem o mesmo nome da class
- sobrecarga de construtores: 

``` java
public Dado(){
    this(6,1);
}
public Dado(int _lados){
    this(_lados,1);
}
public Dado(int _lados, int valor){
    lados = _lados;
    valor = _valor;
}
```
dado eu = this;

# Métodos de Acesso
- get  : ler o valor;
- set  : usado para alterar; 
- is   : usado para valores booleanos;
