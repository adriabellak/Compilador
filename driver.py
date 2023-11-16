from antlr4 import *
from baby_duckListener import baby_duckListener
from baby_duckLexer import baby_duckLexer
from baby_duckParser import baby_duckParser
from funciones import *

def main():
    input_stream = FileStream('./fibo.txt')
    lexer = baby_duckLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = baby_duckParser(stream)

    tree = parser.programa()

    if tree.exception:
        print('no jala')
    else:
        listener = baby_duckListener()
        walker = ParseTreeWalker()
        walker.walk(listener, tree)

        print_pilas()
        print_funcs()
        print_vars()

if __name__ == '__main__':
    main()