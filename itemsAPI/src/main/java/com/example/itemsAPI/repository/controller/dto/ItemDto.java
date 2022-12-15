package com.example.itemsAPI.repository.controller.dto;

import lombok.Data;

@Data
public class ItemDto {


        public ItemDto( String name, String description, String imageUrl) {

                this.name = name;
                this.description = description;
                this.imageUrl = imageUrl;
        }


        private String name;

        public String getName() {
                return name;
        }


        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public String getImageUrl() {
                return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
        }

        private String description;

        private String imageUrl;



}
