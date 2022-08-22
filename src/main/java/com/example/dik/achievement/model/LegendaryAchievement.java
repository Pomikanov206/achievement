package com.example.dik.achievement.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "legendary_achievement")
public class LegendaryAchievement extends Achievement{
    private List<String> legendaryList;

    public LegendaryAchievement() {

    }

    public LegendaryAchievement(int id, String title, String description, String imageUrl, List<String> legendaryList) {
        super(id, title, description, imageUrl);
        this.legendaryList = legendaryList;
    }

    public List<String> getLegendaryList() {
        return legendaryList;
    }

    public void setLegendaryList(List<String> legendaryList) {
        this.legendaryList = legendaryList;
    }
}
