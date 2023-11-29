import React, { useState } from 'react';
import { View, Text, TextInput, Button } from 'react-native';
import styles from "./styles";

const LoginScreen = ({ navigation }) => {
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleLogin = () => {
    // Implement authentication logic here
    // For simplicity, just navigate to a home screen on successful login
    // navigation.navigate('Home');
    console.log(username);
  
  };

  return (
    <View style ={styles.loginBackground}>
      <Text>Login</Text>
      <TextInput
        placeholder="Username"
        value={username}
        onChangeText={(text) => setUsername(text)}
      />
      <TextInput
        placeholder="Password"
        secureTextEntry
        value={password}
        onChangeText={(text) => setPassword(text)}
      />
      <Button title="Login" onPress={handleLogin} />
    </View>
  );
};

export default LoginScreen;
