algoritmo "8"
var
X,H,Y,Z,U,N,M:REAL
inicio
ESCREVAL(" DIGITE UMA DISTANCIA EM METROS:")
LEIA(X)
H<-X/1000
Y<-X/100
Z<-X/10
U<-X*10
N<-X*100
M<-X*10009
ESCREVAL(" A DISTANCIA DE ",X," CORRESPONDE A :")
ESCREVAL(H," KM",                         U," DM")
ESCREVAL(Y," HM",                         N," CM")
ESCREVAL(Z," DAM",                        M," MM")




fimalgoritmo
