#compilador

CC = gcc

# Flags

CFLAGS = -lm
#-ly -ll

# Ficheros

PROG = calcu3

#HDRS =

HDRS = hoc.h \
      $(PROG).tab.h 
#      f3.h \
#      f4.h

#CRCS =

CSRCS = symbol.c \
        init.c \
        math.c 
#        f4.c

SRCS = $(CSRCS) \
      lex.yy.c \
      $(PROG).tab.c

#OBJS =  lex.yy.o \
#        $(PROG).tab.o

OBJS =  symbol.o \
        init.o \
        math.o \
        lex.yy.o \
        calcu3.tab.o


.c.o:
	$(CC) -c $*.c
#

$(PROG): $(OBJS)
	$(CC) $(CFLAGS) $(OBJS) -o $(PROG)

# Dependencias de los ficheros C
$(OBJS): $(HDRS)


# Dependencies de los ficheros de LEX y YACC

lex.yy.c: $(PROG).l $(PROG).tab.h
	lex $(PROG).l

$(PROG).tab.c $(PROG).tab.h: $(PROG).y
	bison -dv $(PROG).y

borrar:
	rm $(PROG) *.o $(PROG).tab.c $(PROG).tab.h lex.yy.c $(PROG).output

