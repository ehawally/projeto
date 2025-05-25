package repositories;

import java.util.List;
import java.util.ArrayList;

public class ListaSEncadeada<Cliente> {
    private class Node {
        Cliente valor;
        Node next;

        Node(Cliente valor) {
            this.valor = valor;
            this.next = null;
        }
    }

    private Node head;
    private int tamanho;

    public ListaSEncadeada() {
        head = null;
        tamanho = 0;
    }
    public void addFirst(Cliente valor) {
        Node novo = new Node(valor);
        novo.next = head;
        head = novo;
        tamanho++;
    }
    public void addLast(Cliente valor) {
        Node novo = new Node(valor);
        if (head == null) {
            head = novo;
        } else {
            Node atual = head;
            while (atual.next != null) {
                atual = atual.next;
            }
            atual.next = novo;
        }
        tamanho++;
    }
     public void insertAt(int pos, Cliente valor) {
        if (pos < 0 || pos > tamanho) {
            throw new IndexOutOfBoundsException("Posição indisponível");
        }
        if (pos == 0) {
            addFirst(valor);
        } else {
            Node novo = new Node(valor);
            Node atual = head;
            for (int i = 0; i < pos - 1; i++) {
                atual = atual.next;
            }
            novo.next = atual.next;
            atual.next = novo;
            tamanho++;
        }
    }
    public Cliente removeFirst() {
        if (head == null) {
            System.out.println("Lista vazia");
            return null;
        }
        Cliente valor = head.valor;
        head = head.next;
        tamanho--;
        return valor;
    }
    public Cliente removeLast() {
        if (head == null) {
            System.out.println("Lista vazia");
            return null;
        }
         if (head.next == null) {
             Cliente valor = head.valor;
            head = null;
            tamanho--;
            return valor;
        }
        Node atual = head;
        while (atual.next.next != null) {
            atual = atual.next;
        }
        Cliente valor = atual.next.valor;
        atual.next = null;
        tamanho--;
        return valor;
    }
    public Cliente removeAt(int pos) {
        if (pos < 0 || pos >= tamanho) {
            throw new IndexOutOfBoundsException("Posição indisponível");
        }
        if (pos == 0) {
            return removeFirst();
        }
        Node atual = head;
        for (int i = 0; i < pos -1; i++) {
            atual = atual.next;
        }
        Cliente valor = atual.next.valor;
        atual.next = atual.next.next;
        tamanho--;
        return valor;
    }

    public int size() {
        return tamanho;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
     public Cliente get(int pos) {
        if (pos < 0 || pos >= tamanho) {
            throw new IndexOutOfBoundsException("Posição indiponivel");
        }
        Node atual = head;
        for (int i = 0; i < pos; i++) {
            atual = atual.next;
        }
        return atual.valor;
    }
     public List<Cliente> listarTodos() {
        List<Cliente> lista = new ArrayList<>();
        Node atual = head;
        while (atual != null) {
            lista.add(atual.valor);
            atual = atual.next;
        }
        return lista;
    }
}
