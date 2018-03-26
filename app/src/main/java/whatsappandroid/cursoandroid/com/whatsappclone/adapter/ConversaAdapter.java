package whatsappandroid.cursoandroid.com.whatsappclone.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import whatsappandroid.cursoandroid.com.whatsappclone.R;
import whatsappandroid.cursoandroid.com.whatsappclone.model.Conversa;

/**
 * Created by Thiago on 08/03/2018.
 */
public class ConversaAdapter extends ArrayAdapter<Conversa> {
    private ArrayList<Conversa> conversas;
    private Context context;


    public ConversaAdapter(Context c, ArrayList<Conversa> objects) {
        super(c, 0, objects);
        this.context = c;
        this.conversas = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View view = null;

        //verifica se a lista está preenchida
        if(conversas != null){
            //Inicializar objeto para montagem da view
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

            //monta view a partir do xml
            view = inflater.inflate(R.layout.lista_conversas, parent, false);

            //recuperar elementos para exibição na tela
            TextView nome = (TextView) view.findViewById(R.id.tv_titulo);
            TextView ultimaMensagem = (TextView) view.findViewById(R.id.tv_subtitulo);

            Conversa conversa = conversas.get(position);
            nome.setText(conversa.getNome());
            ultimaMensagem.setText(conversa.getMensagem());

        }

        return view;
    }
}
