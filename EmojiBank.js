EmojiBank.js
import React, { useState } from 'react';

//import { Container } from './styles';
import './EmojiBank.css';

function EmojiBank() {
    const [emoji, setEmoji] = useState('');
    const onOptionChange = (event) => {
        setEmoji(event.target.value);
    }

return (
    <div className='Emojis'>
        <h1>Emoji Bank</h1>
        <h2>Select An Emoji </h2>
        <input type='radio' id='Smiling' name='emoji' value='😄' onChange={onOptionChange} />
        <label htmlFor='Smiling'>😄</label>
        <input type='radio' id='Excited' name='emoji' value='😆'onChange={onOptionChange}/>
        <label htmlFor='Excited'>😆</label>
        <input type='radio' id='Happy' name='emoji' value='😊' onChange={onOptionChange}/>
        <label htmlFor='Happy'>😊</label>
        <input type='radio' id='Angel' name='emoji' value='😇' onChange={onOptionChange}/>
        <label htmlFor='Angel'>😇</label>
        <input type='radio' id='Upside Down' name='emoji' value='🙃' onChange={onOptionChange}/>
        <label htmlFor='Upside Down'>🙃</label>
        <input type='radio' id='Wink' name='emoji' value='😉' onChange={onOptionChange}/>
        <label htmlFor='Wink'>😉</label>
        <input type='radio' id='Relieved' name='emoji' value='😌' onChange={onOptionChange}/>
        <label htmlFor='Relieved'>😌</label>
        <input type='radio' id='Heart Eyes' name='emoji' value='😍' onChange={onOptionChange}/>
        <label htmlFor='Heart Eyes'>😍</label>
        <input type='radio' id='Enamored' name='emoji' value='😘' onChange={onOptionChange}/>
        <label htmlFor='Enamored'>😘</label>
        <input type='radio' id='Blowing Kiss' name='emoji' value='😚' onChange={onOptionChange}/>
        <label htmlFor='Blowing Kiss'>😚</label>
        <input type='radio' id='Savoring' name='emoji' value='😋' onChange={onOptionChange}/>
        <label htmlFor='Savoring'>😋</label>
        <input type='radio' id='Squinting' name='emoji' value='😝' onChange={onOptionChange}/>
        <label htmlFor='Squinting'>😝</label>
        <input type='radio' id='Wink w/Tongue' name='emoji' value='😜' onChange={onOptionChange}/>
        <label htmlFor='Wink w/Tongue'>😜</label>
        <input type='radio' id='Goofy' name='emoji' value='🤪' onChange={onOptionChange}/>
        <label htmlFor='Goofy'>🤪</label>
        <input type='radio' id='Nerd' name='emoji' value='🤓' onChange={onOptionChange}/>
        <label htmlFor='Nerd'>🤓</label>
        <input type='radio' id='Cool' name='emoji' value='😎' onChange={onOptionChange}/>
        <label htmlFor='Cool'>😎</label>
        <input type='radio' id='Star-Struck' name='emoji' value='🤩' onChange={onOptionChange}/>
        <label htmlFor='Star-Struck'>🤩</label>
        <input type='radio' id='Party' name='emoji' value='🥳' onChange={onOptionChange}/>
        <label htmlFor='Party'>🥳</label>
        <input type='radio' id='Smirk' name='emoji' value='😏' onChange={onOptionChange}/>
        <label htmlFor='Smirk'>😏</label>

        <input type='radio' id='Overwhelmed' name='emoji' value='😩'onChange={onOptionChange}/>
        <label htmlFor='Overwhelmed'>😩</label>
        <input type='radio' id='Pleading' name='emoji' value='🥺' onChange={onOptionChange}/>
        <label htmlFor='Pleading'>🥺</label>
        <input type='radio' id='Loud Cry' name='emoji' value='😭' onChange={onOptionChange}/>
        <label htmlFor='Loud Cry'>😭</label>
        <input type='radio' id='Mind Blown' name='emoji' value='🤯' onChange={onOptionChange}/>
        <label htmlFor='Mind Blown'>🤯</label>
        <input type='radio' id='Hot' name='emoji' value='🥵' onChange={onOptionChange} />
        <label htmlFor='Hot'>🥵</label>
        <input type='radio' id='Hug' name='emoji' value='🤗' onChange={onOptionChange}/>
        <label htmlFor='Hug'>🤗</label>
        <input type='radio' id='Cover Mouth' name='emoji' value='🤭' onChange={onOptionChange}/>
        <label htmlFor='Cover Mouth'>🤭</label>
        <input type='radio' id='Drooling' name='emoji' value='🤤' onChange={onOptionChange}/>
        <label htmlFor='Drooling'>🤤</label>
        <input type='radio' id='Loaded' name='emoji' value='🤑' onChange={onOptionChange}/>
        <label htmlFor='Loaded'>🤑</label>
        <input type='radio' id='Heart Hands' name='emoji' value='🫶' onChange={onOptionChange} />
        <label htmlFor='Heart Hands'>🫶</label>
        <input type='radio' id='Raising Hands' name='emoji' value='🙌' onChange={onOptionChange}/>
        <label htmlFor='Raising Hands'>🙌</label>
        <input type='radio' id='Ok' name='emoji' value='👌' onChange={onOptionChange}/>
        <label htmlFor='Ok'>👌</label>
        <input type='radio' id='Crossed Fingers' name='emoji' value='🤞' onChange={onOptionChange} />
        <label htmlFor='Crossed Fingers'>🤞</label>
        <input type='radio' id='Folded Hands' name='emoji' value='🙏' onChange={onOptionChange}/>
        <label htmlFor='Folded Hands'>🙏</label>
        <input type='radio' id='Call Me' name='emoji' value='🤙' onChange={onOptionChange}/>
        <label htmlFor='Call Me'>🤙</label>
        <input type='radio' id='Bite Lips' name='emoji' value='🫦' onChange={onOptionChange}/>
        <label htmlFor='Bite Lips'>🫦</label>
        <input type='radio' id='Tongue' name='emoji' value='👅' onChange={onOptionChange}/>
        <label htmlFor='Tongue'>👅</label>
        <input type='radio' id='Kiss' name='emoji' value='💋' onChange={onOptionChange}/>
        <label htmlFor='Kiss'>💋</label>

        <input type='radio' id='Pregnant' name='emoji' value='🤰' onChange={onOptionChange} />
        <label htmlFor='Pregnant'>🤰</label>
        <input type='radio' id='Bouquet' name='emoji' value='💐' onChange={onOptionChange} />
        <label htmlFor='Bouquet'>💐</label>
        <input type='radio' id='Rose' name='emoji' value='🌹' onChange={onOptionChange}/>
        <label htmlFor='Rose'>🌹</label>
        <input type='radio' id='Tulip' name='emoji' value='🌷' onChange={onOptionChange}/>
        <label htmlFor='Tulip'>🌷</label>
        <input type='radio' id='Sun Face' name='emoji' value='🌞' onChange={onOptionChange}/>
        <label htmlFor='Sun Face'>🌞</label>
        <input type='radio' id='Rainbow' name='emoji' value='🌈' onChange={onOptionChange}/>
        <label htmlFor='Rainbow'>🌈</label>
        <input type='radio' id='Sparkles' name='emoji' value='✨' onChange={onOptionChange}/>
        <label htmlFor='Sparkles'>✨</label>
        <input type='radio' id='Trophy' name='emoji' value='🏆' onChange={onOptionChange}/>
        <label htmlFor='Trophy'>🏆</label>
        <input type='radio' id='Confetti Ball' name='emoji' value='🎊' onChange={onOptionChange}/>
        <label htmlFor='Confetti Ball'>🎊</label>
        <input type='radio' id='Party Popper' name='emoji' value='🎉' onChange={onOptionChange}/>
        <label htmlFor='Party Popper'>🎉</label>
        <input type='radio' id='Gift' name='emoji' value='🎁' onChange={onOptionChange}/>
        <label htmlFor='Gift'>🎁</label>
        <input type='radio' id='Pink Heart' name='emoji' value='🩷' onChange={onOptionChange}/>
        <label htmlFor='Pink Heart'>🩷</label>

        <input type='radio' id='Orange Heart' name='emoji' value='🧡' onChange={onOptionChange}/>
        <label htmlFor='Orange Heart'>🧡</label>
        <input type='radio' id='Yellow Heart' name='emoji' value='💛' onChange={onOptionChange}/>
        <label htmlFor='Yellow Heart'>💛</label>
        <input type='radio' id='Green Heart' name='emoji' value='💚' onChange={onOptionChange}/>
        <label htmlFor='Green Heart'>💚</label>
        <input type='radio' id='Light Blue Heart' name='emoji' value='🩵' onChange={onOptionChange}/>
        <label htmlFor='Light Blue Heart'>🩵</label>
        <input type='radio' id='Blue Heart' name='emoji' value='💙' onChange={onOptionChange}/>
        <label htmlFor='Blue Heart'>💙</label>
        <input type='radio' id='Purple Heart' name='emoji' value='💜' onChange={onOptionChange}/>
        <label htmlFor='Purple Heart'>💜</label>
        <input type='radio' id='Black Heart' name='emoji' value='🖤' onChange={onOptionChange}/>
        <label htmlFor='Black Heart'>🖤</label>
        <input type='radio' id='White Heart' name='emoji' value='🤍' onChange={onOptionChange}/>
        <label htmlFor='White Heart'>🤍</label>
        <input type='radio' id='Broken Heart' name='emoji' value='💔' onChange={onOptionChange}/>
        <label htmlFor='Broken Heart'>💔</label>
        <input type='radio' id='Revolving Hearts' name='emoji' value='💞' onChange={onOptionChange}/>
        <label htmlFor='Revolving Hearts'>💞</label>
        <input type='radio' id='Beating Heart' name='emoji' value='💓' onChange={onOptionChange}/>
        <label htmlFor='Beating Heart'>💓</label>
        <input type='radio' id='Growing Heart' name='emoji' value='💗' onChange={onOptionChange}/>
        <label htmlFor='Growing Heart'>💗</label>
        <input type='radio' id='Sparkling Heart' name='emoji' value='💖' onChange={onOptionChange}/>
        <label htmlFor='Sparkling Heart'>💖</label>
        <input type='radio' id='Cupid Heart' name='emoji' value='💘' onChange={onOptionChange}/>
        <label htmlFor='Cupid Heart'>💘</label>


        <p> Selected Emoji is {emoji}</p>
        </div>
       ) 

}
export default EmojiBank;




    
    