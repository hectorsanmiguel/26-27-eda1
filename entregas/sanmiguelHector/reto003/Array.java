public class Array
{
    private Nodo primero;
    private int tamaño;

    public Array()
    {
        this.primero = null;
        this.tamaño = 0;
    }

    public void añadir(int valor)
    {
        Nodo nuevoNodo = new Nodo(valor);

        if (primero == null)
        {
            primero = nuevoNodo;
        }
        else
        {
            Nodo actual = primero;
            while (actual.siguiente != null)
            {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }
}