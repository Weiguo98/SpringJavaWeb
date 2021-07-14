package com.mszlu.blog.domain;

public class Author {
        private Long id;
        private String realName;
        private String nickName;

        public void setId(Long id) {
                this.id = id;
        }

        public void setNickName(String nickName) {
                this.nickName = nickName;
        }

        public void setRealName(String realName) {
                this.realName = realName;
        }

        public Long getId() {
                return id;
        }

        public String getNickName() {
                return nickName;
        }

        public String getRealName() {
                return realName;
        }
}
