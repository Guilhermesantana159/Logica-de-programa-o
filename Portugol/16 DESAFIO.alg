algoritmo "16 DESAFIO"
var

X,Y,D,Z:REAL

inicio
ESCREVAL("==========================================")
ESCREVAL("   REDUCAO TEMPO DE VIDA DE UM FUMANTE    ")
ESCREVAL("==========================================")
ESCREVAL("DIGITE A QUANTIDADE DE CIGARRO QUE VOCE FUMA POR DIA:")
LEIA(X)
ESCREVAL("AGORA DIGITE A QUANTOS ANOS VOCE FUMA:")
LEIA(Y)
X<-X*10
D<-X*365
Z<-(D/60)/24
ESCREVAL("VOCE PERDERÁ ",Z," DIAS DE VIDAS")




fimalgoritmo
