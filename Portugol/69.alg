algoritmo "semnome"
var
X,Y,Z,V,SOMA:INTEIRO
inicio
ESCREVAL("================================")
ESCREVAL("               PA")
ESCREVAL("================================")
ESCREVAL("DIGITE O PRIMEIRO TERMO DA PA:")
LEIA(X)
ESCREVAL("DIGITE O ULTIMO TERMO DA PA:")
LEIA(Y)
ESCREVAL("DIGITE A RAZÃO:")
LEIA(Z)
PARA V<-X ATE Y PASSO Z FACA
ESCREVA(V)
SOMA<-SOMA+V
FIMPARA
ESCREVAL(" A SOMA DESSA PA SERA: ",SOMA)


fimalgoritmo
