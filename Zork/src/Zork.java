import java.util.Scanner;

public class Zork 
{
	public static void main(String[] args)
	{
		int input; //Create the variable that will hold the user's input
		
		Scanner keyboard = new Scanner(System.in); //Create the scanner 'keyboard' that will prompt for user input
		
		System.out.println("ZORK");
		System.out.println("");
		
		
		//Start off in room 1
		System.out.println("You are standing in the foyer of an old house. \nYou see a dead scorpion. \n{You can (1)exit to the north.}");
		input = keyboard.nextInt(); //prompt for user input and store the input in that variable 'input'
		
		if (input == 1) //go to room 2
		{
			System.out.println("You are standing in the front room of this house. \nYou see a piano. \n{You can (1) exit to the south, (2) exit to the west, (3) exit to the east.}");
			input = keyboard.nextInt();
			
			if (input == 1) //go to room 1
			{
				System.out.println("You are standing in the foyer of an old house. \nYou see a dead scorpion. \n{You can (1)exit to the north.}");
				input = keyboard.nextInt();
				
				if (input == 1) //go to room 2
				{
					System.out.println("You are standing in the front room of this house. \nYou see a piano. \n{You can (1) exit to the south, (2) exit to the west, (3) exit to the east.}");
					input = keyboard.nextInt();
					
					if (input == 1) //go to room 1
					{
						System.out.println("You are standing in the foyer of an old house. \nYou see a dead scorpion. \n{You can (1)exit to the north.}");
						input = keyboard.nextInt();
						
						if (input == 1) //go to room 2
						{
							System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
							//this is where another loop for the options in room 2 would be inserted
						}
					}
					if (input == 2) //go to room 3
					{
						System.out.println("You are standing in a library. \nYou see spiders. \n{You can (1)exit to the east, (2)exit to the north}");
						input = keyboard.nextInt();
						
						if (input == 1) //go to room 2
						{
							System.out.println("You are standing in the front room of this house. \nYou see a piano. \n{You can (1) exit to the south, (2) exit to the west, (3) exit to the east.}");
							input = keyboard.nextInt();
							
							if (input == 1) //go to room 1
							{
								System.out.println("You are standing in the foyer of an old house. \nYou see a dead scorpion. \n{You can (1)exit to the north.}");
								input = keyboard.nextInt();
								
								if (input == 1)//go to room 2
								{
									System.out.println("You are standing in the front room of this house. \nYou see a piano. \n{You can (1) exit to the south, (2) exit to the west, (3) exit to the east.}");
									input = keyboard.nextInt();
									
									if (input == 1) //go to room 1
									{
										System.out.println("You are standing in the foyer of an old house. \nYou see a dead scorpion. \n{You can (1)exit to the north.}");
										input = keyboard.nextInt();
										
										if (input == 1) //go to room 2
										{
											System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
											//this is where another loop for the options in room 2 would be inserted
										}
									}
									if (input == 2) //go to room 3
									{
										System.out.println("You are standing in a library. \nYou see spiders. \n{You can (1)exit to the east, (2)exit to the north}");
										input = keyboard.nextInt();
										
										if (input == 1) //go to room 2
										{
											System.out.println("You are standing in the front room of this house. \nYou see a piano. \n{You can (1) exit to the south, (2) exit to the west, (3) exit to the east.}");
											input = keyboard.nextInt();
											
											if (input == 1) //go to room 1
											{
												System.out.println("You are standing in the foyer of an old house. \nYou see a dead scorpion. \n{You can (1)exit to the north.}");
												input = keyboard.nextInt();
												
												if (input == 1)//go to room 2
												{
													System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
													//This is where another loop for the options in room 2 would be inserted
												}
											}

										}
										if (input == 2) //go to room 5
										{
											System.out.println("You are standing in a dining room. \nYou see dust and an empty box. \n{You can (1) exit to the south.}");
											input = keyboard.nextInt();
											
											if (input == 1) //go to room 3
											{
												System.out.println("You are standing in a library. \nYou see spiders. \n{You can (1)exit to the east, (2)exit to the north}");
												input = keyboard.nextInt();
												
												if (input == 1) //go to room 2
												{
													System.out.println("You are standing in the front room of this house. \nYou see a piano. \n{You can (1) exit to the south, (2) exit to the west, (3) exit to the east.}");
													input = keyboard.nextInt();
													
													if (input == 1) //go to room 1
													{
														System.out.println("You are standing in the foyer of an old house. \nYou see a dead scorpion. \n{You can (1)exit to the north.}");
														input = keyboard.nextInt();
														
														if (input == 1) //go to room 2
														{
															System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
															//This is where another loop for the options in room 2 would be inserted
														}
													}
												}		
											}
										}	
									}
									if (input == 3) //go to room 4
									{
										System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
										input = keyboard.nextInt();
										
										if (input == 1) //go to room 2
										{
											System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
											// this is where another loop of all the options for room 2 would be inserted
										}
										if (input == 2) //go to room 7
										{
											System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
											input = keyboard.nextInt();
											
											if (input == 1) //go to room 6
											{
												System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
												input = keyboard.nextInt();
											}
											if (input == 2) //go to room 4
											{
												System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
												input = keyboard.nextInt();
												
												if (input == 1) //go to room 2
												{
													System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
													// this is where another loop of all the options for room 2 would be inserted
												}
												if (input == 2) //go to room 7
												{
													System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
													input = keyboard.nextInt();
													
													if (input == 1) //go to room 6
													{
														System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
														input = keyboard.nextInt();
													}
													if (input == 2) //go to room 4
													{
														System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
														input = keyboard.nextInt();
														
														if (input == 1) //go to room 2
														{
															System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
															// this is where another loop of all the options for room 2 would be inserted
														}
														if (input == 2) //go to room 7
														{
															System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
															input = keyboard.nextInt();
															
															if (input == 1) //go to room 6
															{
																System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
																input = keyboard.nextInt();
															}
															if (input == 2) //go to room 4
															{
																System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
																input = keyboard.nextInt();
																
																if (input == 1) //go to room 2
																{
																	System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
																	// this is where another loop of all the options for room 2 would be inserted
																}
																if (input == 2) //go to room 7
																{
																	System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
																	input = keyboard.nextInt();
																	
																	if (input == 1) //go to room 6
																	{
																		System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
																		input = keyboard.nextInt();
																	}
																	if (input == 2) //go to room 4
																	{
																		System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
																		//this is where another loop for all the options for room 4 would be inserted
																	}
																	
																}
															}
															
														}
													}
													
												}
											}
											
										}
									}
								}
							}

						}
						if (input == 2) //go to room 5
						{
							System.out.println("You are standing in a dining room. \nYou see dust and an empty box. \n{You can (1) exit to the south.}");
							input = keyboard.nextInt();
							
							if (input == 1) //go to room 3
							{
								System.out.println("You are standing in a library. \nYou see spiders. \n{You can (1)exit to the east, (2)exit to the north}");
								input = keyboard.nextInt();
								
								if (input == 1) //go to room 2
								{
									System.out.println("You are standing in the front room of this house. \nYou see a piano. \n{You can (1) exit to the south, (2) exit to the west, (3) exit to the east.}");
									input = keyboard.nextInt();
									
									if (input == 1) //go to room 1
									{
										System.out.println("You are standing in the foyer of an old house. \nYou see a dead scorpion. \n{You can (1)exit to the north.}");
										input = keyboard.nextInt();
										
										if (input == 1) //go to room 2
										{
											System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
											//This is where another loop for the options in room 2 would be inserted
										}
									}
								}		
							}
						}	
					}
					if (input == 3) //go to room 4
					{
						System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
						input = keyboard.nextInt();
						
						if (input == 1) //go to room 2
						{
							System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
							// this is where another loop of all the options for room 2 would be inserted
						}
						if (input == 2) //go to room 7
						{
							System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
							input = keyboard.nextInt();
							
							if (input == 1) //go to room 6
							{
								System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
								input = keyboard.nextInt();
							}
							if (input == 2) //go to room 4
							{
								System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
								input = keyboard.nextInt();
								
								if (input == 1) //go to room 2
								{
									System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
									// this is where another loop of all the options for room 2 would be inserted
								}
								if (input == 2) //go to room 7
								{
									System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
									input = keyboard.nextInt();
									
									if (input == 1) //go to room 6
									{
										System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
										input = keyboard.nextInt();
									}
									if (input == 2) //go to room 4
									{
										System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
										input = keyboard.nextInt();
										
										if (input == 1) //go to room 2
										{
											System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
											// this is where another loop of all the options for room 2 would be inserted
										}
										if (input == 2) //go to room 7
										{
											System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
											input = keyboard.nextInt();
											
											if (input == 1) //go to room 6
											{
												System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
												input = keyboard.nextInt();
											}
											if (input == 2) //go to room 4
											{
												System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
												input = keyboard.nextInt();
												
												if (input == 1) //go to room 2
												{
													System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
													// this is where another loop of all the options for room 2 would be inserted
												}
												if (input == 2) //go to room 7
												{
													System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
													input = keyboard.nextInt();
													
													if (input == 1) //go to room 6
													{
														System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
														input = keyboard.nextInt();
													}
													if (input == 2) //go to room 4
													{
														System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
														//this is where another loop for all the options for room 4 would be inserted
													}
													
												}
											}
											
										}
									}
									
								}
							}
							
						}
					}
				}
			}
			if (input == 2) //go to room 3
			{
				System.out.println("You are standing in a library. \nYou see spiders. \n{You can (1)exit to the east, (2)exit to the north}");
				input = keyboard.nextInt();
				
				if (input == 1) //go to room 2
				{
					System.out.println("You are standing in the front room of this house. \nYou see a piano. \n{You can (1) exit to the south, (2) exit to the west, (3) exit to the east.}");
					input = keyboard.nextInt();
					
					if (input == 1) //go to room 1
					{
						System.out.println("You are standing in the foyer of an old house. \nYou see a dead scorpion. \n{You can (1)exit to the north.}");
						input = keyboard.nextInt();
						
						if (input == 1)//go to room 2
						{
							System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
							//This is where another loop for the options in room 2 would be inserted
						}
					}

				}
				if (input == 2) //go to room 5
				{
					System.out.println("You are standing in a dining room. \nYou see dust and an empty box. \n{You can (1) exit to the south.}");
					input = keyboard.nextInt();
					
					if (input == 1) //go to room 3
					{
						System.out.println("You are standing in a library. \nYou see spiders. \n{You can (1)exit to the east, (2)exit to the north}");
						input = keyboard.nextInt();
						
						if (input == 1) //go to room 2
						{
							System.out.println("You are standing in the front room of this house. \nYou see a piano. \n{You can (1) exit to the south, (2) exit to the west, (3) exit to the east.}");
							input = keyboard.nextInt();
							
							if (input == 1) //go to room 1
							{
								System.out.println("You are standing in the foyer of an old house. \nYou see a dead scorpion. \n{You can (1)exit to the north.}");
								input = keyboard.nextInt();
								
								if (input == 1) //go to room 2
								{
									System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
									//This is where another loop for the options in room 2 would be inserted
								}
							}
						}		
					}
				}	
			}
			if (input == 3) //go to room 4
			{
				System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
				input = keyboard.nextInt();
				
				if (input == 1) //go to room 2
				{
					System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
					// this is where another loop of all the options for room 2 would be inserted
				}
				if (input == 2) //go to room 7
				{
					System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
					input = keyboard.nextInt();
					
					if (input == 1) //go to room 6
					{
						System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
						input = keyboard.nextInt();
						
						if (input == 1)//go to room 7
						{
							System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
							input = keyboard.nextInt();
							
							if (input == 1) //go to room 6
							{
								System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
								input = keyboard.nextInt();
								
								if (input == 1)//go to room 7
								{
									//
								}
							}
							if (input == 2) //go to room 4
							{
								System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
								input = keyboard.nextInt();
								
								if (input == 1) //go to room 2
								{
									System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
									// this is where another loop of all the options for room 2 would be inserted
								}
								if (input == 2) //go to room 7
								{
									System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
									input = keyboard.nextInt();
									
									if (input == 1) //go to room 6
									{
										System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
										input = keyboard.nextInt();
										
										if (input == 1)//go to room 7
										{
											//
										}
									}
									if (input == 2) //go to room 4
									{
										System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
										input = keyboard.nextInt();
										
										if (input == 1) //go to room 2
										{
											System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
											// this is where another loop of all the options for room 2 would be inserted
										}
										if (input == 2) //go to room 7
										{
											System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
											input = keyboard.nextInt();
											
											if (input == 1) //go to room 6
											{
												System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
												input = keyboard.nextInt();
												
												if (input == 1)//go to room 7
												{
													//
												}
											}
											if (input == 2) //go to room 4
											{
												System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
												input = keyboard.nextInt();
												
												if (input == 1) //go to room 2
												{
													System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
													// this is where another loop of all the options for room 2 would be inserted
												}
												if (input == 2) //go to room 7
												{
													System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
													input = keyboard.nextInt();
													
													if (input == 1) //go to room 6
													{
														System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
														input = keyboard.nextInt();
														
														if (input == 1)//go to room 7
														{
															//
														}
													}
													if (input == 2) //go to room 4
													{
														System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
														//this is where another loop for all the options for room 4 would be inserted
													}
													
												}
											}
											
										}
									}
									
								}
							}
						}
					}
					if (input == 2) //go to room 4
					{
						System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
						input = keyboard.nextInt();
						
						if (input == 1) //go to room 2
						{
							System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
							// this is where another loop of all the options for room 2 would be inserted
						}
						if (input == 2) //go to room 7
						{
							System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
							input = keyboard.nextInt();
							
							if (input == 1) //go to room 6
							{
								System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
								input = keyboard.nextInt();
								
								if (input == 1)//go to room 7
								{
									//
								}
							}
							if (input == 2) //go to room 4
							{
								System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
								input = keyboard.nextInt();
								
								if (input == 1) //go to room 2
								{
									System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
									// this is where another loop of all the options for room 2 would be inserted
								}
								if (input == 2) //go to room 7
								{
									System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
									input = keyboard.nextInt();
									
									if (input == 1) //go to room 6
									{
										System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
										input = keyboard.nextInt();
										
										if (input == 1)//go to room 7
										{
											//
										}
									}
									if (input == 2) //go to room 4
									{
										System.out.println("You are standing in a kitchen. \nYou see bats. \n{You can (1)exit to the west, (2)exit to the north}");
										input = keyboard.nextInt();
										
										if (input == 1) //go to room 2
										{
											System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
											// this is where another loop of all the options for room 2 would be inserted
										}
										if (input == 2) //go to room 7
										{
											System.out.println("You are standing in a parlor. \nYou see a treasure chest. \n{You can (1) exit to the west, (2) exit to the south.}");
											input = keyboard.nextInt();
											
											if (input == 1) //go to room 6
											{
												System.out.println("You are standing in a vault. \nYou see 3 walking skeletons. \n{You can (1) exit to the east.}");
												input = keyboard.nextInt();
												
												if (input == 1)//go to room 7
												{
													//
												}
											}
											if (input == 2) //go to room 4
											{
												System.out.println("Stop trying to break the game by going back and forth! \nRestart it if you want to play again...");
												//this is where another loop for all the options for room 4 would be inserted
											}
											
										}
									}
									
								}
							}
							
						}
					}
					
				}
			}
		}
		
	}
	
}
