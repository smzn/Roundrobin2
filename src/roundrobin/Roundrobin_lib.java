package roundrobin;

public class Roundrobin_lib {
	
	private int n,k, idx[];
	private int [][]result;
	private MySQL mysql = new MySQL();

	public Roundrobin_lib(int n, int k, long total) {
		this.n = n;
		this.k = k;
		idx = new int[k];
	}
	
	public void getCombination(){
		int index = 0, roop = 0;	
		
		for(idx[0] = 0; idx[0] < n-k+1; idx[0]++){
			for(idx[1] = idx[0]+1; idx[1] < n-k+2; idx[1]++){
				for(idx[2] = idx[1]+1; idx[2] < n-k+3; idx[2]++){
					for(idx[3] = idx[2]+1; idx[3] < n-k+4; idx[3]++){
						for(idx[4] = idx[3]+1; idx[4] < n-k+5; idx[4]++){
							for(idx[5] = idx[4]+1; idx[5] < n-k+6; idx[5]++){
								for(idx[6] = idx[5]+1; idx[6] < n-k+7; idx[6]++){
									for(idx[7] = idx[6]+1; idx[7] < n-k+8; idx[7]++){
										for(idx[8] = idx[7]+1; idx[8] < n-k+9; idx[8]++){
											for(idx[9] = idx[8]+1; idx[9] < n-k+10; idx[9]++){
												for(idx[10] = idx[9]+1; idx[10] < n-k+11; idx[10]++){
													for(idx[11] = idx[10]+1; idx[11] < n-k+12; idx[11]++){
														for(idx[12] = idx[11]+1; idx[12] < n-k+13; idx[12]++){
															for(idx[13] = idx[12]+1; idx[13] < n-k+14; idx[13]++){
																for(idx[14] = idx[13]+1; idx[14] < n-k+15; idx[14]++){
																	for(idx[15] = idx[14]+1; idx[15] < n-k+16; idx[15]++){
																		for(idx[16] = idx[15]+1; idx[16] < n-k+17; idx[16]++){
																			for(idx[17] = idx[16]+1; idx[17] < n-k+18; idx[17]++){
																				for(idx[18] = idx[17]+1; idx[18] < n-k+19; idx[18]++){
																					for(idx[19] = idx[18]+1; idx[19] < n-k+20; idx[19]++){
																						for(idx[20] = idx[19]+1; idx[20] < n-k+21; idx[20]++){
																							for(idx[21] = idx[20]+1; idx[21] < n-k+22; idx[21]++){
																								for(idx[22] = idx[21]+1; idx[22] < n-k+23; idx[22]++){
																									for(idx[23] = idx[22]+1; idx[23] < n-k+24; idx[23]++){
																										for(idx[24] = idx[23]+1; idx[24] < n-k+25; idx[24]++){
																											for(idx[25] = idx[24]+1; idx[25] < n-k+26; idx[25]++){
																												for(idx[26] = idx[25]+1; idx[26] < n-k+27; idx[26]++){
																													for(idx[27] = idx[26]+1; idx[27] < n-k+28; idx[27]++){
																														for(idx[28] = idx[27]+1; idx[28] < n-k+29; idx[28]++){
																															for(idx[29] = idx[28]+1; idx[29] < n-k+30; idx[29]++){
																																for(idx[30] = idx[29]+1; idx[30] < n-k+31; idx[30]++){
																																	for(idx[31] = idx[30]+1; idx[31] < n-k+32; idx[31]++){
																																		for(idx[32] = idx[31]+1; idx[32] < n-k+33; idx[32]++){
																																			for(idx[33] = idx[32]+1; idx[33] < n-k+34; idx[33]++){
																																				for(idx[34] = idx[33]+1; idx[34] < n-k+35; idx[34]++){
																																					for(idx[35] = idx[34]+1; idx[35] < n-k+36; idx[35]++){
																																						for(idx[36] = idx[35]+1; idx[36] < n-k+37; idx[36]++){
																																							for(idx[37] = idx[36]+1; idx[37] < n-k+38; idx[37]++){
																																								for(idx[38] = idx[37]+1; idx[38] < n-k+39; idx[38]++){
																																									for(idx[39] = idx[38]+1; idx[39] < n-k+40; idx[39]++){
																																										//for(idx[40] = idx[39]+1; idx[40] < n-k+41; idx[40]++){
																																											inputResult(index, idx);
																																											mysql.insertCombination(k, idx);
																																											index++;
																																										//}//40
																																									}//39
																																								}//38
																																							}//37
																																						}//36
																																					}//35
																																				}//34
																																			}//33
																																		}//32
																																	}//31
																																}//30
																															}//29
																														}//28
																													}//27
																												}//26
																											}//25
																										}//24
																									}//23
																								}//22
																							}//21
																						}//20
																					}//19
																				}//18
																			}//17
																		}//16
																	}//15
																}//14
															}//13
														}//12
													}//11
												}//10
											}//9
										}//8
									}//7
								}//6
							}//5
						}//4
					}//3
				}//2
			}//1
		}//0
	}
		
	public void inputResult(int index, int idx[]){
		for(int i = 0; i < k; i++){
			if(i == 0)
				System.out.print("index:"+index+"(");
			System.out.print(idx[i]+",");
			if(i == k-1)
				System.out.println(")");
		}
	}
	
	public void inputDatabase(int index, int idx[]){
		
	}
	

}
