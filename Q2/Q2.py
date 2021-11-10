class ProcessaString:
    def processar(self, s):
        self.s = s
        if self.s == None:
            return 'null'
        elif len (self.s) <= 3:
            return self.s.upper()
        else:
            aux = list(self.s)
            aux[0] = self.s[2]
            aux[2] = self.s[0]
            aux1 = "".join(aux)
            return aux1.upper()
            
            
string=ProcessaString()

a=string.processar('aBc')
b=string.processar('aBcderfsvgtyh')



print("b = ", b)