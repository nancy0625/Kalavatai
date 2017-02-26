package com.example.asus.Mentality;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;


/**
 * Created by asus on 2017/1/29.
 */
public class BookFragment extends Fragment {

    private BeatBook mBeatBook;
    private Button list_item_book_button;


    public static BookFragment newInstance(){
        return new BookFragment();
    }
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        mBeatBook = new BeatBook(getActivity());

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_book,container,false);
        getActivity();
                        RecyclerView recyclerView = (RecyclerView)view
                .findViewById(R.id.fragment_book_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),3));//表示网格的每行有3列
        recyclerView.setAdapter(new BookAdapter(mBeatBook.getBooks()));

        return view;

    }
    private class BookHolder extends RecyclerView.ViewHolder{
        private Button mButton;
        private Book mBook;


        public BookHolder(LayoutInflater inflater,ViewGroup container){
            super(inflater.inflate(R.layout.list_book,container,false));

            mButton = (Button)itemView.findViewById(R.id.list_item_book_button);

            list_item_book_button = (Button) itemView.findViewById(R.id.list_item_book_button);
            list_item_book_button.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Intent intent = new Intent(getActivity(),ReadAssetFragment.class);
                    startActivity(intent);
                }
            });


//            mButton.setOnClickListener(new View.OnClickListener(){
//                @Override
//                public void onClick(View v){
//                    Intent intent = new Intent(BookActivity.this,ReadAssetFragment.class);
//                    startActivity(intent);
//                }
//            });

        }
        public void bindBook(Book book){
            mBook = book;
            mButton.setText(mBook.getName());
        }
    }

    private class BookAdapter extends RecyclerView.Adapter<BookHolder>{
        private List<Book> mBooks;

        public BookAdapter(List<Book> books){
            mBooks = books;
        }
        @Override
        public BookHolder onCreateViewHolder(ViewGroup parent,int viewType){
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new BookHolder(inflater,parent);
        }

        @Override
        public void onBindViewHolder(BookHolder bookHolder,int position){
            Book book = mBooks.get(position);
            bookHolder.bindBook(book);

        }
        @Override
        public int getItemCount(){
            return mBooks.size();
        }
    }
}
