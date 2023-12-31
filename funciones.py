# objetos sin clase si como no
funciones = {}
variables = {}
operadores = [] #stack
operandos = [] #stack
tipos = [] #stack
saltos = [] #stack
cuadruplos = [] #fila: .pop(0)
temporales = 0 # contador de numero de temporales
comparadores = ['<', '>', '!=']
opers = ['+', '-', '*', '/']
gotos = ['Goto', 'GotoF', 'GotoV']
cubo_semantico = {
    ('int', 'int', '+'): 'int',
    ('int', 'int', '-'): 'int',
    ('int', 'int', '*'): 'int',
    ('int', 'int', '/'): 'float',
    ('int', 'float', '+'): 'float',
    ('int', 'float', '-'): 'float',
    ('int', 'float', '*'): 'float',
    ('int', 'float', '/'): 'float',
    ('int', 'string', '+'): 'Error',
    ('int', 'string', '-'): 'Error',
    ('int', 'string', '*'): 'Error', # podria ser 'string'
    ('int', 'string', '/'): 'Error',
    ('float', 'int', '+'): 'float',
    ('float', 'int', '-'): 'float',
    ('float', 'int', '*'): 'float',
    ('float', 'int', '/'): 'float',
    ('float', 'float', '+'): 'float',
    ('float', 'float', '-'): 'float',
    ('float', 'float', '*'): 'float',
    ('float', 'float', '/'): 'float',
    ('string', 'string', '+'): 'string',
    ('string', 'string', '-'): 'Error',
    ('string', 'string', '*'): 'Error',
    ('string', 'string', '/'): 'Error',
    ('string', 'int', '+'): 'Error',
    ('string', 'int', '-'): 'Error',
    ('string', 'int', '*'): 'Error', # podria ser 'string'
    ('string', 'int', '/'): 'Error',
    ('string', 'float', '+'): 'Error',
    ('string', 'float', '-'): 'Error',
    ('string', 'float', '*'): 'Error',
    ('string', 'float', '/'): 'Error',
    ('int', 'int', '>'): 'bool',
    ('int', 'float', '>'): 'bool',
    ('float', 'int', '>'): 'bool',
    ('float', 'float', '>'): 'bool',
    ('int', 'int', '<'): 'bool',
    ('int', 'float', '<'): 'bool',
    ('float', 'int', '<'): 'bool',
    ('float', 'float', '<'): 'bool',
    ('int', 'int', '!='): 'bool',
    ('int', 'float', '!='): 'bool',
    ('float', 'int', '!='): 'bool',
    ('float', 'float', '!='): 'bool',
}

def nueva_func(nombre, parametros):
    if nombre in funciones:
        raise ValueError(f"Nombre de función duplicado ('{nombre}')")
    else:
        if parametros != '()':
            params_list = parametros[1:-1].split(',')
            params_dic = {}
            for param in params_list:
                n, t = param.split(':')
                params_dic[n] = t
            funciones[nombre] = {'parametros': params_dic}
        else:
            funciones[nombre] = {'parametros': {}}

def print_funcs():
    print(funciones)

def agregar_vars(nombres, tipo):
    nombres_list = nombres.split(',')
    for n in nombres_list:
        nueva_var(n, tipo, 'scope')

def nueva_var(nombre, tipo, scope):
    if nombre in variables and variables[nombre]['scope'] == scope:
        print('nombre de var duplicado')
    else:
        variables[nombre] = {'tipo': tipo, 'valor': None, 'scope': scope}

def print_vars():
    print(variables)    

def buscar_cubo(tipo1, tipo2, operador):
    if operador in comparadores:
        return 'bool'
    return 'temp'
    # return cubo_semantico.get((x, y, operador), 'Error')

def push_operador(op):
    # print('push_operador:', op)
    operadores.append(op)

def top_operador():
    if len(operadores) > 0:
        # print('top_operador:', operadores[-1])
        return operadores[-1]
    else:
        # print('top_operador: vacio')
        return None 

def push_tipo(t):
    tipos.append(t)

def push_operando(op, tipo):
    # print('push_operando:', op)
    operandos.append(op)
    if tipo == 'ID':
        # arreglar esto
        pass
    push_tipo(tipo)

def push_salto(s):
    saltos.append(s)

def push_cuadruplo(cuad):
    cuadruplos.append(cuad)

def crear_cuadruplo(operador, left_op, right_op = None, target = None):
    if target == 't':
        global temporales 
        temporales += 1
        target = 't' + str(temporales)
    cuad = [operador, left_op, right_op, target]
    push_cuadruplo(cuad)

def print_cuadruplo(cuad):
    c = str(cuad[0]) + ', ' + str(cuad[1]) + ', ' + str(cuad[2]) + ', ' + str(cuad[3])
    return c

def print_cuadruplos():
    print('- Cuádruplos:')
    for i, cuad in enumerate(cuadruplos):
        print(f"{i}: {print_cuadruplo(cuad)}")

def print_pilas():
    print()
    print("- Operadores(",len(operadores),"):", operadores)
    print("- Operandos(", len(operandos), "):", operandos)
    print("- Tipos(",len(tipos),"):", tipos)
    print("- Saltos(",len(saltos),"):", saltos)
    print_cuadruplos()
    print()
    print()

def operacion(operador, left_op, right_op):
    resultado = None
    if left_op in variables:
        left_op = variables[left_op]['valor']
    if right_op in variables:
        right_op = variables[right_op]['valor']
    left_op = float(left_op)
    right_op = float(right_op)
    # print(left_op, type(left_op), operador, right_op, type(left_op))
    if operador == '-':
        resultado = left_op-right_op
    elif operador == '+':
        resultado = left_op+right_op
    elif operador == '*':
        resultado = left_op*right_op
    elif operador == '/':
        resultado = left_op/right_op
    elif operador == '>':
        resultado = left_op>right_op
    elif operador == '<':
        resultado = left_op<right_op
    elif operador == '!=':
        resultado = left_op!=right_op
    return resultado

# PUNTOS NEURALGICOS

def punto1(operando, tipo, signo):
    if signo == '-':
        operando = '-' + operando
    push_operando(operando, tipo)

def punto2(operador):
    # print('p2')
    push_operador(operador)

def punto3(operador):
    # print('p3')
    push_operador(operador)

def punto4():
    # print('p4')
    if (top_operador() == '+' or top_operador() == '-'):
        # print('p4 suma/resta')
        right_op = operandos.pop()
        right_t = tipos.pop()
        left_op = operandos.pop()
        left_t = tipos.pop()
        operador = operadores.pop()
        resultado_t = buscar_cubo(left_t, right_t, operador)
        if resultado_t == 'Error':
            print('aiuda error en el kubo')
        else:
            crear_cuadruplo(operador, left_op, right_op, 't')
            push_operando('t' + str(temporales), resultado_t)

def punto5():
    # print('p5')
    if (top_operador() == '*' or top_operador() == '/'):
        right_op = operandos.pop()
        right_t = tipos.pop()
        left_op = operandos.pop()
        left_t = tipos.pop()
        operador = operadores.pop()
        resultado_t = buscar_cubo(left_t, right_t, operador)
        if resultado_t == 'Error':
            print('aiuda error en el kubo')
        else:
            crear_cuadruplo(operador, left_op, right_op, 't')
            push_operando('t' + str(temporales), resultado_t)

def punto6():
    push_operador('(')

def punto7():
    operadores.pop()

def punto8(op):
    push_operador(op)

def punto9():
    if ((top_operador() == '<' or top_operador() == '>') or top_operador() == '!='):
        right_op = operandos.pop()
        right_t = tipos.pop()
        left_op = operandos.pop()
        left_t = tipos.pop()
        operador = operadores.pop()
        resultado_t = buscar_cubo(left_t, right_t, operador)
        if resultado_t == 'Error':
            print('aiuda error en el kubo')
        else:
            crear_cuadruplo(operador, left_op, right_op, 't')
            push_operando('t' + str(temporales), resultado_t)

def pop_assign():
    if top_operador() == '=':
        right_op = operandos.pop()
        right_t = tipos.pop()
        left_op = operandos.pop()
        left_t = tipos.pop()
        operador = operadores.pop()
        # checar que los tipos hagan match
        crear_cuadruplo(operador, right_op, None, left_op)

def print_expresion():
    expresion = operandos.pop()
    tipos.pop()
    crear_cuadruplo('print', expresion)

def llenar_cuadruplo(pendiente, target):
    cuadruplos[pendiente][3] = target

def if1():
    tipo_expresion = tipos.pop()
    if tipo_expresion != 'bool':
        raise ValueError('Expresion de if debe ser de tipo bool')
    else:
        resultado = operandos.pop()
        push_salto(len(cuadruplos))
        crear_cuadruplo('GotoF', resultado, None, 'blank')

def if2():
    cuad_pendiente = saltos.pop()
    llenar_cuadruplo(cuad_pendiente, len(cuadruplos))

def if3():
    crear_cuadruplo('Goto', None, None, 'blank')
    f = saltos.pop()
    push_salto(len(cuadruplos)-1)
    llenar_cuadruplo(f, len(cuadruplos))

def cycle1():
    push_salto(len(cuadruplos))

def cycle2():
    tipo_expresion = tipos.pop()
    if tipo_expresion != 'bool':
        raise ValueError('Expresion de if debe ser de tipo bool')
    else:
        resultado = operandos.pop()
        s = saltos.pop()
        crear_cuadruplo('GotoV', resultado, None, s)

def print_string(s):
    crear_cuadruplo('print', s)

def ejecutar_cuadruplos():
    global variables
    c = 0
    while c < len(cuadruplos):
        cuad = cuadruplos[c]
        # print()
        # print('cuadruplo', c)
        # print(print_cuadruplo(cuad))
        temp = True
        if cuad[3] in variables:
            temp = False
        if cuad[0] == '=':
            if temp:
                nueva_var(cuad[3], 'temp', 'scope')
            if cuad[1] in variables:
                variables[cuad[3]]['valor'] = variables[cuad[1]]['valor']
            else:
                variables[cuad[3]]['valor'] = cuad[1]
        elif cuad[0] in opers or cuad[0] in comparadores:
            resultado = operacion(cuad[0], cuad[1], cuad[2])
            if temp:
                nueva_var(cuad[3], 'temp', 'scope')
            variables[cuad[3]]['valor'] = resultado
        elif cuad[0] == 'print':
            if cuad[1] in variables:
                print(variables[cuad[1]]['valor'])
            else:
                print(cuad[1])
        elif cuad[0] in gotos:
            if cuad[0] == 'Goto':
                c = cuad[3] - 1
            if cuad[0] == 'GotoV':
                if variables[cuad[1]]['valor'] == True:
                    c = cuad[3] - 1
            if cuad[0] == 'GotoF':
                if variables[cuad[1]]['valor'] == False:
                    c = cuad[3] - 1
        # print_vars()
        c+=1