package com.hha.heinhtetaung.movieshelf.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.hha.heinhtetaung.movieshelf.R;
import com.hha.heinhtetaung.movieshelf.delegate.MoviesActionDelegate;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by E5 on 12/7/2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {
    private MoviesActionDelegate mMoviesActionDelegate;

    public MyViewHolder(View itemView, MoviesActionDelegate moviesActionDelegate) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mMoviesActionDelegate = moviesActionDelegate;

    }

    @OnClick(R.id.cv_item_movies)
    public void onMoviesItemTap(View view) {
        mMoviesActionDelegate.onTapMovieItems();
    }
}
