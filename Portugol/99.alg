algoritmo "semnome"
var
X,Y:INTEIRO
RES:REAL
FUNCAO POTENCIAL(A,B:INTEIRO):REAL
VAR
Z:REAL
INICIO
Z<-(A^B)
RETORNE Z
FIMFUNCAO
inicio
ESCREVAL("=================================")
ESCREVAL("           POTENCIAL          ")
ESCREVAL("=================================")
ESCREVAL("DIGITE A BASE:")
LEIA(X)
ESCREVAL("DIGITE A POTENCIA:")
LEIA(Y)
RES<-POTENCIAL(X,Y)
ESCREVAL("O VALOR DA POTENCIA SERA:",RES)

fimalgoritmo
