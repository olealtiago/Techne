class Lampada:
    def __init__(self, estado):
        self.estado = estado
    def Ligar(self):
        self.estado == True
    def Desligar(self):
        self.estado == False
    def Imprime(self):
        print("Lampada Ligada" if self.estado == True else "Lampada Deslidada")
        
lampada = Lampada(False)
estado = lampada.Imprime()

lampada = Lampada(True)
estado = lampada.Imprime()

lampada = Lampada(True)
estado = lampada.Imprime()

lampada = Lampada(False)
estado = lampada.Imprime()