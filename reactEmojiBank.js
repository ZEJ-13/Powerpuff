import React, { useState } from 'react';
import './emojiBank.css';


const emojiBank = {
  Smile: "😄",
  Excited: "😆",
  Happy: "😊",
  Angel: "😇",
  UpsideDown: "🙃",    
  Wink: "😉",
  Relieved: "😌",
  Love: "😍",
  Enamored: "😘",
  BlowingKiss: "😚",
  Savoring: "😋",
  Squinting: "😝",
  Silly: "😜",
  Goofy: "🤪",
  Nerd: "🤓",
  Cool: "😎",
  StarStruck: "🤩",
  Party: "🥳",
  Smirk: "😏",
  Overwhelmed: "😩",
  Pleading: "🥺",
  LoudCry: "😭", 
  MindBlown: "🤯",
  Hot: "🥵",
  Hug: "🤗",
  CoverMouth: "🤭",
  Drooling: "🤤",
  Loaded: "🤑",
  HeartHands: "🫶",
  RaisingHands: "🙌",
  Ok: "👌",
  CrossedFingers: "🤞",
  FoldedHands: "🙏",
  CallMe: "🤙",
  BiteLips: "🫦",
  Tongue: "👅",
  Kiss: "💋",
  Pregnant: "🤰",
  Bouquet: "💐",
  Rose: "🌹",
  Tulip: "🌷",
  SunFace: "🌞",
  Rainbow: "🌈",
  Sparkles: "✨",
  Trophy: "🏆",
  ConfettiBall: "🎊",
  PartyPopper: "🎉",
  Gift: "🎁",
  PinkHeart: "🩷",
  OrangeHeart: "🧡",
  YellowHeart: "💛",
  GreenHeart: "💚",
  LightBlueHeart: "🩵",
  BlueHeart: "💙",
  PurpleHeart: "💜",
  BlackHeart: "🖤",
  WhiteHeart: "🤍",
  BrokenHeart: "💔",
  RevolvingHearts: "💞",
  BeatingHeart: "💓",
  GrowingHeart: "💗",
  SparklingHeart: "💖",
  CupidHeart: "💘",

};

function EmojiBank() {
  const [selectedEmoji, setSelectedEmoji] = useState(null);

  const handleEmojiSelection = (key) => {
    setSelectedEmoji(emojiBank[key]);
  };

  return (
    <div>
      <h1>Emoji Bank</h1>
      <div id="emojiBank">
        {Object.keys(emojiBank).map((key) => (
          <label key={key}>
            <input
              type="radio"
              name="emoji"
              value={key}
              id={key}
              className="emoji-radio"
              onChange={() => handleEmojiSelection(key)}
            />
            {emojiBank[key]}
          </label>
        ))}
      </div>

      {selectedEmoji && (
        <div>
          <h2>Selected Emoji</h2>
          <p>{selectedEmoji}</p>
        </div>
      )}
    </div>
  );
}

export default EmojiBank;
