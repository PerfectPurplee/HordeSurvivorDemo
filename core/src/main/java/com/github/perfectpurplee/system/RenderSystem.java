package com.github.perfectpurplee.system;

import com.badlogic.ashley.core.Entity;
import com.badlogic.ashley.core.EntitySystem;
import com.badlogic.ashley.systems.SortedIteratingSystem;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.utils.Disposable;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.github.perfectpurplee.asset.AssetService;
import com.github.perfectpurplee.asset.MapAsset;

public class RenderSystem extends SortedIteratingSystem implements Disposable {


    private final OrthogonalTiledMapRenderer mapRenderer;

    public RenderSystem(Batch batch, Viewport viewport) {


    }

    @Override
    protected void processEntity(Entity entity, float deltaTime) {


        this.viewport.apply();
        this.batch.setColor(Color.WHITE);
        this.mapRenderer.setView(this.camera);
        this.mapRenderer.render();

    }

    public void setMap(TiledMap tiledMap) {
        this.mapRenderer.setMap(tiledMap);
    }

    @Override
    public void dispose() {

        this.mapRenderer.dispose();
    }
}
