import React from "react";
import ReactPlayer from "react-player";
import { useParams } from "react-router-dom";
import "./Tralier.css";

const Tralier = () => {
  let key = useParams().ytLink;
  console.log(key);

  return (
    <div>
      {key != null ? (
        <ReactPlayer
          controls="true"
          playing={true}
          url={`https://www.youtube.com/watch?v=${key}`}
          width="100%"
          height="100%"
        ></ReactPlayer>
      ) : null}
    </div>
  );
};

export default Tralier;
