class Turma:
    def __init__(self, notaAluno1, notaAluno2):
        self.notaAluno1 = notaAluno1
        self.notaAluno2 = notaAluno2

    def calcularMedia(self):
        print("media da turma =", (self.mediaAluno1+self.mediaAluno2+self.mediaAluno3)/3)

class Aluno:
    def calcularMedia(self):
        self.media = (self.p1+self.p2)/2

class Prova:
    def calcularNotaTotal(self, q1, q2):
        self.q1 = q1
        self.q2 = q2
        self.nota = self.q1+self.q2
        if self.nota > 10:
            print("nota invalida (nota maior que 10)")
        else:
            return self.nota

a1 = Prova()
a2 = Prova()

aluno1 = a1.calcularNotaTotal(3, 4)
aluno2 = a2.calcularNotaTotal(4, 1)

print("aluno 1: ", aluno1)
print("aluno 2: ", aluno2)

# aluno3 = Aluno()

# turma1 = Turma()




# prova1 = Prova()
# prova2 = Prova()