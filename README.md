# HashDemo: SHA-256 vs SHA3-256 (Keccak) Comparison

This repository contains a simple Java demonstration used for an ECE 424 (Information & Network Security) final project.  
The goal is to compare **SHA-256** (Merkle–Damgård) with **SHA3-256** (Keccak Sponge) and illustrate why SHA-3 is not vulnerable to length-extension attacks.

---

## Overview

Cryptographic hash functions take an input message of any length and output a fixed-size digest.  
This demo shows:

- How **SHA-256** and **SHA3-256** produce hashes for the *same* message  
- How their outputs differ visually and structurally  
- How SHA-3’s **sponge construction** prevents length-extension attacks  
- How easy it is to swap hashing algorithms using Java’s built-in `MessageDigest` library

This project is part of a broader exploration into modern cryptographic design, secure hashing, and protocol robustness.

---

## 📁 Files Included

| File | Description |
|------|-------------|
| `HashDemo.java` | Main Java program that computes SHA-256 and SHA3-256 hashes |
| `pseudocode.txt` | Pseudocode explaining the hashing logic (optional) |
| `README.md` | Project documentation |

---

## What This Java Program Demonstrates

- **Comparison of SHA-256 and SHA3-256**  
  Shows how both algorithms hash the *same* message but produce completely different outputs.

- **Structural Differences in the Hashes**  
  Highlights how SHA-256 (Merkle–Damgård) and SHA-3 (Sponge) use fundamentally different internal designs.

- **SHA-3’s Resistance to Length-Extension Attacks**  
  Demonstrates that modifying/adding to an input cannot continue the hash because the sponge construction hides the internal state.

---

## How to Run `HashDemo.java`

```bash
# Compile
javac HashDemo.java

# Run
java HashDemo
